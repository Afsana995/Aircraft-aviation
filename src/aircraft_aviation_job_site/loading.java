/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aircraft_aviation_job_site;

/**
 *
 * @author ASUS
 */
public class loading {
    public static void main(String[] args){
   Front_page f = new Front_page();
  f.setVisible(true);
  try{
  for(int x = 0; x <= 100; x++){
     Thread.sleep(50);
     Front_page.jLabel2.setText(Integer.toString(x)+"%");
     Front_page.jProgressBar1.setValue(x);
  }
  }
      catch(Exception e){
  }
}
}