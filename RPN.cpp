#include<iostream>
#include<string>
#include<stack>
using namespace std;

int main()
{
    int T;cin>>T;
    string Ex;
    for(int i=0;i<T;i++)
    {
        cin>>Ex;
        string out;
        out = RPN(Ex);
        cout<<out<<'\n';
    }
    return 0;
}

string RPN(string ex)
{   
    int len;
    string final;
    len = ex.size();
    stack <int> st;

    for(int i=0;i<len;i++)
    {
        if(ex[i] == '(')
            st.push('(')
        if(ex[i] == ')')
        { 
            while(st.top() != '(')
            {
                final += st.top();
                st.pop();
            }
            st.pop();
        }
        if((ex[i] == '+') || (ex[i] == '-') || (ex[i] == '*') || (ex[i] == '/') || (ex[i] == '^'))
        {
           x = priority_check(ex[i],st.top);
           if(x == 1)
           {
               st.push(ex[i]);
           }
           else
           {
               ch = st.top();
               st.pop();
               st.push(ex[i]);
               st.push(ch);
           }
        
