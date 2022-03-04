package day26_jdbc_gui.ex01.jdbc;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.table.AbstractTableModel;

public class MyModel extends AbstractTableModel {
	
	Object[][] data;
	String[] columnName;
	int rows, cols; // 레코드 행과 열의 개수를 저장하는 변수
	
	@Override
	public int getColumnCount() { // 필드(열)의 개수
		return columnName.length;
	}

	@Override
	public int getRowCount() { // 필드(열)의 개수
		return data.length;
	}
	
	// 레코드 개수 알아내기 - user method
	public void getRowCount(ResultSet rsScroll) {
		try {
			rsScroll.last(); // 레코드의 마지막 행으로 커서 이동
			rows = rsScroll.getRow();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];
	}

	// DB에 저장된 데이터 채움
	public void setData(ResultSet rs) {
		try {
			String title;
			// 데이터에 대한 정보 얻어옴
			ResultSetMetaData rsmd = rs.getMetaData();
			cols = rsmd.getColumnCount(); // 열의 개수 얻어옴
			columnName = new String[cols];
			
			for (int i = 0; i < cols; i++) {
				columnName[i] = rsmd.getColumnClassName(i+1); // 필드번호는 1부터시작
			}
			data = new Object[rows][cols];
			int r = 0;
			
			while (rs.next()) {
				for (int i = 0; i < cols; i++) {
					if (i != 1) data[r][i] = rs.getObject(i+1); // number type
					else data[r][i] = rs.getObject(i+1); // varchar2 type
				}
				r++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
