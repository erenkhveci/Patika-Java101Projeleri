package SalaryCalculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }
    double tax(){
        double tax=0;
        if(this.salary<1000){
            tax= 0;

        }else if(salary>=1000){
            tax= salary*0.03;

        }
        return tax;
    }
    int bonus(){
        int bonus=0;
        if(workHours>40){
            bonus=(workHours-40)*30;
            System.out.println("Bonus :"+bonus);

        }else {
            System.out.println("Bonusunuz :"+bonus);
            return bonus;
        }
        return bonus;
    }
    double raiseSalary(){
        double raise=0;
        if(hireYear<10){
            raise=(salary*0.05);
        }else if(hireYear>9&&hireYear<20){
            raise=(salary*0.1);
        }else if (hireYear>19) {
            raise=(salary*0.15);
        }
        return raise;
    }


   public String toString(){

       System.out.println("Adı :"+name+"\n"+"Maaşı : "+salary+"\n"+"Çalışma Saati : "+workHours+"\n"+"Başlangıç Yılı : "+hireYear+"\n"+"Vergi : "+tax()+"\n"+"Bonus : "+bonus()+"\n"+"Maaş Artışı : "+raiseSalary()+"\n"+"Vergi ve bonuslar ile maaş : "+(salary+bonus()-tax())+"\n"+"Toplam maaş : "+(salary+bonus()-tax()+raiseSalary()));

       return null;
   }
  /* System.out.println("Adı :"+name+"\n"+"Maaşı : "+salary+"\n"+"Çalışma Saati : "+workHours+"\n"+"Başlangıç Yılı : "+hireYear+"\n"+"Vergi : "+tax()+"\n"+"Bonus : "+bonus()+"Maaş Artışı : "+raiseSalary()+"\n"+"Vergi ve bonuslar ile maaş : "+(salary+bonus()-tax())+"\n"+"Toplam maaş : "+(salary+bonus()-tax()+raiseSalary()));
*/
}
