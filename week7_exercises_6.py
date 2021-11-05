#!/usr/bin/env python
# coding: utf-8

# In[5]:


question = "What topping would you like on your pizza?"
question += "\nEnter 'quit' when you are finished: "

active = true 
while active:
    topping = input(question)
    if topping != 'quit':
        print( topping + " will be added to your pizza.")
    else:
        break 


# In[ ]:




