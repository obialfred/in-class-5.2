import java.util.Date;
import java.util.Scanner;

class BlogEntry {
    Date entryDate;
    String userName;
    String textEntry;
    entryDate = new Date;
    
    public BlogEntry(String userName, String textEntry, Date entryDate ){
        this.userName = userName;
        this.textEntry = textEntry;
        this.entryDate = entryDate;
        

    }

    public void displayToString(){
        System.out.println(userName);
        System.out.println(textEntry);
        System.out.println(entryDate);
        
    }

    public String getSummary(){
        for (i = 0; i<textEntry[11];i++){
            String sum= System.out.print(i);
        }
        return sum;
    }

    public static void main(String[] args){
            displayToString();
            getSummary();
    }


}

// BlogEntry test = newBlogEntry inside 

// public BlogEntry(String p String e, String m, int d, int y)
// {
//     post = p;
//     entry =0;
//     date.set_date(m,d,y)
// }