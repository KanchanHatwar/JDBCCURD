package com.jdbc;

public class BussnessLogicLayer {
 private DBManeger db;

public BussnessLogicLayer() {
	
	db=new DBManeger();
}
 public void SelectData()
 {
	db.selectRecord(); 
 }
 //updation deletion
 public void insertData(int sid,String name,int rollno,int mark) {
	 String query="INSERT INTO student(sid,name,rollno,mark) VALUES(' "+sid+" ',' "+name+" ' , '"+rollno+ "' , ' "+mark+" ')";
   if(db.updateRecords(query))
	   System.out.println("Record Saved SucsessFully");
   else
	   System.out.println("Record Not Save Succsfully");
 }
 
 
  public void UpdateData(int sid,String name)
  {
	  
	  String query="UPDATE student SET name='"+name+"' WHERE sid='"+sid+" '";
	  if(db.updateRecords(query))
		  System.out.println("Record Update");
	  else
		  System.out.println("Record Not Update");
  }
  
  public void DeleteData(int sid)
  {
	  String query="DELETE FROM  student WHERE sid= '"+sid+"' ";
	  if(db.updateRecords(query))
		  System.out.println("Delete Record..!");
	  else
		  System.out.println("Not Delete Record..");
  }
}
