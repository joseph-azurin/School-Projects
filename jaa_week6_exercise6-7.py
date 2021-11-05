#!/usr/bin/env python
# coding: utf-8

# In[2]:


people = []
person = {
    'first_name': 'Jeremy',
    'last_name': 'Adams',
    'age': 29,
    'city': 'Arlington',
    }
people.append(person)

person = {
    'first_name': 'Lola',
    'last_name': 'Barns',
    'age': 30,
    'city': 'Arlington',
    }
people.append(person)

person = {
    'first_name': 'Stephen',
    'last_name': 'Bleu',
    'age': 25,
    'city': 'Alexandria',
    }
people.append(person)

for person in people:
    name = person['first_name'].title() + " " + person['last_name'].title()
    age = str(person['age'])
    city = person['city'].title()
    
    print(name + ", who lives in " + city + ", is " + age + " years old.")


# In[ ]:




