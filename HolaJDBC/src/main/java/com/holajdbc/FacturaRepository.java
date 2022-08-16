package com.holajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FacturaRepository {

	public void inserta(Factura factura) throws SQLException {

		String sql = "insert into facturas (numero, concepto, importe) values (?,?,?);";

		try (Connection connection = getConexion(); PreparedStatement sentencia = connection.prepareStatement(sql)) {

			sentencia.setInt(1, factura.getNumero());
			sentencia.setString(2, factura.getConcepto());
			sentencia.setDouble(3, factura.getImporte());

		} catch (SQLException e) {

			throw e;

		}
	}

	public List<Factura> getAll() throws SQLException {

		String sql = "select * from facturas";

		List<Factura> facturas = new ArrayList<Factura>();

		try (Connection conexion = getConexion();
				PreparedStatement sentencia = conexion.prepareStatement(sql);
				ResultSet rs = sentencia.executeQuery()) {

			while (rs.next()) {

				Factura factura = new Factura();

				factura.setNumero(Integer.parseInt(rs.getString("numero")));
				factura.setConcepto(rs.getString("concepto"));
				factura.setImporte(Double.parseDouble(rs.getString("importe")));
				facturas.add(factura);

			}

		} catch (SQLException e) {
			throw e;
		}

		return facturas;
	}

	private Connection getConexion() throws SQLException {

		Connection conexion = MyDataSource.getInstance().getConnection();

		return conexion;
	}

}
