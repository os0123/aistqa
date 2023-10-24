package pract5;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import jxl.Workbook;
import jxl.Sheet;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
public class Pract5 {
public static void main(String[] args) throws FileNotFoundException, IOException,
BiffException, WriteException {
FileInputStream fi=new FileInputStream("C:\\Users\\Student1.xls");
Workbook w= Workbook.getWorkbook(fi);
Sheet s=w.getSheet(0);
String a[][]=new String[s.getRows()][s.getColumns()];
FileOutputStream to=new FileOutputStream("C:\\Users\\Student2.xls");
WritableWorkbook wwb=Workbook.createWorkbook(to);
WritableSheet ws=wwb.createSheet("result1",0);
for (int i=0;i<s.getRows();i++) {
 for (int j=0;j<s.getColumns();j++) {
a[i][j]=s.getCell(j,i).getContents();
Label l=new Label(j,i,a[i][j]);
ws.addCell(l);
}
}
Label l=new Label(6,0,"Result");
ws.addCell(l);
for (int i=1;i<s.getRows();i++){
for (int j=5; j<s.getColumns(); j++ ){
a[i][j]=s.getCell(j,i).getContents();
int x=Integer.parseInt(a[i][j]);
if (x/3>35){
Label l1=new Label(6,i,"pass");
ws.addCell(l1);
}
else{
Label l1=new Label(6,i,"fail");
ws.addCell(l1);
break;
}
}
}
wwb.write();
wwb.close();
}
}