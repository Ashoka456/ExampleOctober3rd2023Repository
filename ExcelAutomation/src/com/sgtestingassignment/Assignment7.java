package com.sgtestingassignment;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Assignment7 {

	public static void main(String[] args) {
		readWriteContent();
	}

	private static void readWriteContent() {
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh1=null;
		Sheet sh2=null;
		Row rowsh1=null;
		Row rowsh2=null;
		Cell cellsh1=null;
		Cell cellsh2=null;
		try
		{
			fin=new FileInputStream("D:\\Excel\\Fruit.xlsx");
			wb=new XSSFWorkbook(fin);
			sh1=wb.getSheet("Sheet1");
			sh2=wb.getSheet("Sheet2");
			if(sh2==null)
			{
				sh2=wb.createSheet("Sheet2");

			}
			int rc=sh1.getPhysicalNumberOfRows();
			rowsh2=sh2.getRow(4);
			for(int r=0;r<rc;r++)
			{
				rowsh1=sh1.getRow(r);
				if(rowsh2==null)
				{
					rowsh2=sh2.createRow(4);
				}
				int cc=rowsh1.getPhysicalNumberOfCells();
					cellsh1=rowsh1.getCell(0);
					cellsh2=rowsh2.getCell(r);
					if(cellsh2==null)
					{
						cellsh2=rowsh2.createCell(r);
					}
					String data =cellsh1.getStringCellValue();
					cellsh2.setCellValue(data);

				}
			fout=new FileOutputStream("D:\\Excel\\Fruit.xlsx");
			wb.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				fout.close();
				wb.close();
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}




