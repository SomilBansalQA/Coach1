package org.qait.coach.coach1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelFile {
	static String giftCardFileName;
    static String creditCardFileName;
	protected ExcelFile() {
		giftCardFileName = "C:"+File.separator+"Users"+File.separator+"somilbansal"+File.separator+"Desktop"+File.separator+"US.xls";
		creditCardFileName="C:"+File.separator+"Users"+File.separator+"somilbansal"+File.separator+"Desktop"+File.separator+"USCreditCardDetails.xls";
	}

	private Sheet readExcelFile(String path) {

		FileInputStream fin = null;
		try {
			fin = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Workbook workbook = null;
		try {
			workbook = Workbook.getWorkbook(fin);
		} catch (BiffException | IOException e) {
			e.printStackTrace();
		}

		Sheet sh = workbook.getSheet(0);
		return sh;
	}

	protected String getGiftCardNumber(int cursor) {
		ExcelFile xls = new ExcelFile();
		Sheet sh = xls.readExcelFile(giftCardFileName);
		return sh.getCell(0, cursor).getContents();
	}

	protected String getGiftCardPinNumber(int cursor) {
		ExcelFile xls = new ExcelFile();
		Sheet sh = xls.readExcelFile(giftCardFileName);
		return sh.getCell(1, cursor).getContents();
	}

	protected int getNoOfRows() {
		ExcelFile xls = new ExcelFile();
		Sheet sh = xls.readExcelFile(giftCardFileName);
		return sh.getRows();

	}

	protected int getNoOfColumns() {
		ExcelFile xls = new ExcelFile();
		Sheet sh = xls.readExcelFile(giftCardFileName);
		return sh.getColumns();

	}
	
	protected int getNoOfRowsOfCreditCardFile() {
		ExcelFile xls = new ExcelFile();
		Sheet sh = xls.readExcelFile(giftCardFileName);
		return sh.getRows();

	}

	protected int getNoOfColumnsOfCreditCardFile() {
		ExcelFile xls = new ExcelFile();
		Sheet sh = xls.readExcelFile(giftCardFileName);
		return sh.getColumns();

	}
	
	protected String getCreditCardNumber(int cursor) {
		ExcelFile xls = new ExcelFile();
		Sheet sh = xls.readExcelFile(creditCardFileName);
		return sh.getCell(0, cursor).getContents();
	}

	protected String getCreditCardSecurityNumber(int cursor) {
		ExcelFile xls = new ExcelFile();
		Sheet sh = xls.readExcelFile(creditCardFileName);
		return sh.getCell(1, cursor).getContents();
	}
	
}
