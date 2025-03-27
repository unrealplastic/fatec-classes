const { executeQuery } = require('../config/database');

class ProductModel {
  static async create(product) {
    const sql = `
      INSERT INTO products (id, name, price, description) 
      VALUES (product_seq.NEXTVAL, :name, :price, :description)
      RETURNING id INTO :id
    `;
    
    const result = await executeQuery(sql, {
      ...product,
      id: { dir: oracledb.BIND_OUT, type: oracledb.NUMBER }
    });
    
    return result.outBinds.id[0];
  }

  static async findAll() {
    const sql = `SELECT * FROM products`;
    const result = await executeQuery(sql);
    return result.rows;
  }

  static async findById(id) {
    const sql = `SELECT * FROM products WHERE id = :id`;
    const result = await executeQuery(sql, [id]);
    return result.rows[0];
  }
}

module.exports = ProductModel;