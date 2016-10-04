#include<iostream>
using namespace std;

int main()
{
    int T;cin>>T;
    int A,B,A_rev=0,B_rev=0,R,Sum =0,Sum_rev=0;
    for(int i=0;i<T;i++)
    {
        cin>>A>>B;
        while(A != 0)
        {
            R = A%10;
            A_rev = A_rev*10+R;
            A = A/10;
        }
        while(B != 0)
        {
            R = B%10;
            B_rev = B_rev*10+R;
            B = B/10;
        }
        

        Sum = A_rev+B_rev;
        
        while(Sum != 0)
        {
            R = Sum%10;
            Sum_rev = Sum_rev*10+R;
            Sum = Sum/10;
        }
        cout<<Sum_rev<<"\n";
        B_rev=A_rev=Sum_rev=0;
    }
    return 0;
}
