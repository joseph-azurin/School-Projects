#!/usr/bin/env python
# coding: utf-8

# In[3]:


glossary = {
    'if, else, elif': 'are used for conditional branching or decision making.',
    'for ': ' used for looping. Generally we use for when we know the number of times we want to loop.',
    'True and False ': 'are truth values in Python. They are the results of comparison operations or logical (Boolean) operations in Python.',
    'and, or, not ': 'are the logical operators in Python. and will result into True only if both the operands are True.',
    }

for word, definition in glossary.items():
    print("\n" + word.title() + ": " + definition)


# In[ ]:




