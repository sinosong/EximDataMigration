package com.hns.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ImportExcelUtil {

	private static final String EXCEL_XLS = "xls";
	private static final String EXCEL_XLSX = "xlsx";

	/**
	 * 判断Excel的版本,获取Workbook
	 * 
	 * @param in
	 * @param
	 * @return
	 * @throws IOException
	 */
	public static Workbook getWorkbok(InputStream in, File file)
			throws IOException {
		Workbook wb = null;
		if (file.getName().endsWith(EXCEL_XLS)) { // Excel 2003
			wb = new HSSFWorkbook(in);
		} else if (file.getName().endsWith(EXCEL_XLSX)) { // Excel 2007/2010
			wb = new XSSFWorkbook(in);
		}
		return wb;
	}

	/**
	 * 判断文件是否是excel
	 * 
	 * @throws Exception
	 */
	public static void checkExcelVaild(File file) throws Exception {
		if (!file.exists()) {
			throw new Exception("文件不存在");
		}
		if (!(file.isFile() && (file.getName().endsWith(EXCEL_XLS) || file
				.getName().endsWith(EXCEL_XLSX)))) {
			throw new Exception("文件不是Excel");
		}
	}

	/**
	 * 读取Excel测试，兼容 Excel 2003/2007/2010
	 * 
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		try {
			// 同时支持Excel 2003、2007
			File excelFile = new File("G:/test/poi/bl.xlsx"); // 创建文件对象
			FileInputStream in = new FileInputStream(excelFile); // 文件流
			checkExcelVaild(excelFile);
			Workbook workbook = getWorkbok(in, excelFile);
			// Workbook workbook = WorkbookFactory.create(is); // 这种方式
			// Excel2003/2007/2010都是可以处理的

			int sheetCount = workbook.getNumberOfSheets(); // Sheet的数量

			/**
			 * 设置当前excel中sheet的下标：0开始
			 */
			Sheet sheet = workbook.getSheetAt(0); // 遍历第一个Sheet
			// Sheet sheet = workbook.getSheetAt(2); // 遍历第三个Sheet

			// 获取总行数
			// System.out.println(sheet.getLastRowNum());

			int count = 0;
			for (Row row : sheet) {
				try {
					// 跳过第一和第二行的目录
					if (count < 2) {
						count++;
						continue;
					}

					// 如果当前行没有数据，跳出循环
					if (row.getCell(0).toString().equals("")) {
						return;
					}

					// 获取总列数(空格的不计算)
					// int columnTotalNum = row.getPhysicalNumberOfCells();
					// System.out.println("总列数：" + columnTotalNum);
					// System.out.println("最大列数：" + row.getLastCellNum());

					int end = row.getLastCellNum();

					for (int i = 0; i < end; i++) {
						Cell cell = row.getCell(i);
						if (cell == null) {
							System.out.print("null" + "\t");
							continue;
						}

						Object obj = getValue(cell);
						System.out.print(obj + "\t");
					}
					System.out.println();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Object getValue(Cell cell) {
		Object obj = null;
		switch (cell.getCellType()) {
		case 4:
			obj = cell.getBooleanCellValue();
			break;
		case 5:
			obj = cell.getErrorCellValue();
			break;
		case 0:
			obj = cell.getNumericCellValue();
			break;
		case 1:
			obj = cell.getStringCellValue();
			break;
		default:
			break;
		}
		return obj;
	}

	public <T_T> List<T_T> readBean(InputStream inputStream,
			Map<String, Object> headerMapper, Class<T_T> tClass)
			throws Exception {

		List<T_T> list = new ArrayList<>();

		ArrayList<ArrayList<String>> rows = new ArrayList<>();

		for (int k = 1; k < rows.size(); k++) {
			T_T t = tClass.newInstance();
			for (int num = 0; num < rows.get(0).size(); num++) {

			}
			list.add(t);
		}

		return list;
	}

}
