#include <stdio.h>
#include <string.h>
#include <openssl/md5.h>

char ans[16]= {0xd0,0x49,0x88,0x52,0x2d,0xdf,0xed,0x31,0x33,0xcc,0x24,0xfb,0x69,0x24,0xea,0xe9};
// Test
// char ans[16] = {0x59,0x15,0x9c,0xdb,0x3a,0x45,0xb3,0xbc,0xaa,0x24,0x0a,0xb3,0x20,0x34,0x05,0xc4};
int __calculateHash(char *data,int length){
    MD5_CTX mdContext;
    int bytes;
    unsigned char c[MD5_DIGEST_LENGTH];
    unsigned char d[1024];

    strcpy(d,data);
    bytes = length;
    // printf("d[%i]:%s \r\n",bytes,d);
    for(int i=0;i<25;i++){
        for(int j=0;j<400;j++){
            MD5_Init (&mdContext);
            MD5_Update (&mdContext, d, bytes);
            MD5_Final (c,&mdContext);
            memcpy(d,c,MD5_DIGEST_LENGTH);
            bytes = MD5_DIGEST_LENGTH;
        }
    }
    if(memcmp(d,ans,16)==0){
        printf("pin is : %s",data);
    }
}


int main(void){
    char data[7];
    memset(data,0,7);

    for(int i=750000;i<1000000;i++){
        if(i%1000==0){
            printf("per : %i/1000\r\n",i/1000);
        }
        sprintf(data,"%06i",i);
        __calculateHash(data,6);
    }
}