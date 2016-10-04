#include<iostream>
#include<math.h>

using namespace std;

int main()
{
    int sum=0,T,N;
    cin>>T;   
    for(int i=0;i<T;i++)
    {
        cin>>N;
        for(int j=1;pow(5,j)<=N;j++)
        {
            sum += N/pow(5,j);
        }
        
        cout<<sum<<"\n";
        sum = 0;
    }

return 0;
}
