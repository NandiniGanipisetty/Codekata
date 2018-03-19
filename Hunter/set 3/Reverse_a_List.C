#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};
typedef struct node n;
n *head;
int main()
{
    int a;
    printf("enter the size:");
    scanf("%d",&a);
    printf("enter the list:\n");
    while(a!=0)
    {
        create();
        a--;
    }
    display();
}
create()
{
    int b;
    scanf("%d",&b);
    n *newnode,*temp;
    newnode=(n*)malloc(sizeof(n));
    newnode->data=b;
    newnode->next=head;
    head=newnode;
    
}
display()
{
    while(head!=NULL)
    {
        printf("%d->",head->data);
        head=head->next;
    }
}
   
        

