def Reverse(s): 

    # check the stack is empty of not  
    if s.empty():
    
        # if empty then do nothing
        pass
        
    # if stack is not empty then 
    else:
    
        # pop element and stare it to popped
        popped = s.pop()
        
        # call it self ans pass stack as an argument
        Reverse(s)
        
        # call BottomInsert() method and pass stack
        # and popped element as an argument
        BottomInsert(s, popped)
