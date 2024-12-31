class Solution:
    def romanToInt(self, s: str) -> int:
        x=0
        s=s.replace('IV','*4*')
        s=s.replace('IX','*9*')
        s=s.replace('XL','*40*')
        s=s.replace('XC','*90*')
        s=s.replace('CD','*400*')
        s=s.replace('CM','*900*')
        a=s.split('*')
        b='IVXLCDM'
        c=[1,5,10,50,100,500,1000]
        for i in a:
            if i.isalpha() and len(i)>1:
                for j in i:
                    x+=c[b.index(j)]
            elif i.isalpha() and len(i)==1:
                x+=c[b.index(i)]
            elif i.isnumeric():
                x+=int(i)
        return x
