package pract6;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
public class Pract6 {
public static void main(String[] args) throws FileNotFoundException, IOException,
BiffException, WriteException {
// TODO code application logic here
FileInputStream fi = new FileInputStream("E:\\SEM-5\\STQA\\Marks1.xls");
Workbook w = Workbook.getWorkbook(fi);
Sheet s = w.getSheet(0);
String a[][]= new String[s.getRows()][s.getColumns()];
FileOutputStream fo = new FileOutputStream("E:\\SEM-5\\STQA\\Marks2.xls");
WritableWorkbook wwb = Workbook.createWorkbook(fo);
WritableSheet ws = wwb.createSheet("result1", 0);
 System.out.println();
for (int i=0; i<s.getRows(); i++){
String temp[] = new String[s.getColumns()];
boolean flag = false;
for(int j=0; j<s.getColumns(); j++){
temp[j] = s.getCell(j,i).getContents();
if(i >= 1 && j>=2 && j<=4){
if(Integer.parseInt(temp[j]) >= 60){
flag = true;
}
}
}
if(flag){
for(int k=0; k<temp.length;k++){
Label l2 = new Label(k,i,temp[k]);
ws.addCell(l2);
}
}
}
wwb.write();
wwb.close();
}
}