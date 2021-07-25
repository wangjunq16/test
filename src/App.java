import java.util.Scanner;

public class App {
    public int N = 7;
    public int solution[]=new int[N];
    public int j,k,count=0,sols=0;
    public boolean place(int row,int col){
        for(j=0;j<row;j++)
        {
            if(row-j==solution[row]-solution[j]||row+solution[row]==j+solution[j]||
            solution[j]==solution[row])
            {
                return false;
            }
        }
        return true;
    }
    public void backtrack(int row)
    {
        count++;
        if(row==N){
            sols++;
            for(k=0;k<N;k++)
            {
                System.out.print(solution[k]+" ");
            }
            System.out.println("\n");
        }
        else{
            for(int i=0;i<N;i++)
            {
                solution[row]=i;
                if(place(row, i)){
                    backtrack(row+1);
                }                
            }
        }

    }


    public static void main(String[] args) throws Exception {
        App app=new App();
        app.iter();     
    }

    public void iter(){
        double a,x0,x1=0;
        System.out.print("Input a=");
        Scanner scan=new Scanner(System.in);
        a=scan.nextDouble();
        scan.close();
        if(a<0)
        {
            System.out.println("error");
        }
        else{
            x0=a/2;
            x1=(x0+a/x0)/2;
            while(Math.abs(x0-x1)>1e-6){
                x0=x1;
                x1=(x0+a/x0)/2;
            }
            System.out.println("sqrt(" +a+ ")=" + x1);
        }        
    }
}
