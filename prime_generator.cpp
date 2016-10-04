#include <iostream>
using namespace std;


int main()
{
    int T,x,y;
    cin>>T;
    for(int l=0;l<T;l++)
    {
        
        cin>>x>>y;
    int co,list[y-x+1];
    
    for(int i=0;i<y-x+1;i++)
    { 
            list[i]=0;
    }
    for(int i=2;i*i<=y;i++)
    {
        co = x/i;
        co *= i;
        for(int j=co;j<=y;j+=i)
        {
            if(j!=i && j>=x)
            {
                list[j-x]=1;
            }
        }
    }
        for(int k=0;k<=y-x+1;k++)
        {
            if(list[k]==0 && x+k!=1)
            {
                cout<<x+k<<'\n';
            }
            
        }
        cout<<'\n';
    }
   return 0;
}

