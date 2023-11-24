package com.sgtestingassignment;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Assignment2 {

	public static void main(String[] args) {
		writeContent();
		}

		private static void writeContent()
		{
			FileOutputStream fout=null;
			Workbook wb=null;
			Sheet sh=null;
			Row row=null;
			Cell cell=null;
			try
			{
				wb=new XSSFWorkbook();
				sh=wb.createSheet();
				row=sh.createRow(9);
				for(int i=0;i<=20;i++)
				{
					cell=row.createCell(i);
					cell.setCellValue("Fruits"+i);
				}
				fout=new FileOutputStream("D:\\Excel\\Fruits.xlsx");
				wb.write(fout);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					fout.close();
					wb.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}


	

	}


