const oracledb = require('oracledb');
const { executeQuery } = require('../config/database');

class UserModel {
  static async create(user) {
    const sql = `
      INSERT INTO users (id, name, email, password) 
      VALUES (user_seq.NEXTVAL, :name, :email, :password)
      RETURNING id INTO :id
    `;
    
    const binds = {
      name: user.name,
      email: user.email,
      password: user.password,
      id: { dir: oracledb.BIND_OUT, type: oracledb.NUMBER }
    };

    const result = await executeQuery(sql, binds);
    return result.outBinds.id[0];
  }

  static async findByEmail(email) {
    const sql = `SELECT * FROM users WHERE email = :email`;
    const result = await executeQuery(sql, [email]);
    return result.rows[0];
  }

  static async findById(id) {
    const sql = `SELECT * FROM users WHERE id = :id`;
    const result = await executeQuery(sql, [id]);
    return result.rows[0];
  }

  static async update(id, userData) {
    const sql = `
      UPDATE users 
      SET name = :name, email = :email 
      WHERE id = :id
    `;
    await executeQuery(sql, {
      id,
      name: userData.name,
      email: userData.email
    });
  }

  static async delete(id) {
    const sql = `DELETE FROM users WHERE id = :id`;
    await executeQuery(sql, [id]);
  }
}

module.exports = UserModel;