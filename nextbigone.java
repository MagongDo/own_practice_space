package programus;
import java.util.Scanner;
class nextbigone {
    public int solution(int n) {
        int count=Integer.bitCount(n); // 2진수로 변환하여 1의 개수 찾는 매서드(bitCount)
        int nextcount=n+1;
        int answer=0;
        while(true)
        {
            if(Integer.bitCount(nextcount)==count)
            {
                answer=nextcount;
                break;
            }
            else nextcount++;
        }

        return answer;

    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        nextbigone c=new nextbigone();
        int answer=c.solution(n);

        System.out.println(answer);
    }
}