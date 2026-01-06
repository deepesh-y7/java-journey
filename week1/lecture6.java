class Book{
  private  int pageNum;

    void setPageNum(int pgNo){
        if(pgNo>=0){
            pageNum =pgNo;
        }else{
            System.out.println("Enter coreect page no.");
        }
    }
    void disp(){
        System.out.println("Page no :" + pageNum);
    }
}

public class lecture6 {

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setPageNum(8);
        b1.disp();
    }

    
}