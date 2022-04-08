boolean A ()
    {
        return token('a') && B() || token('c');
    }

boolean B()
    {
        return token('d') || token('e');
    }

int A(void)
    {
        return  token('a') || True;
    }