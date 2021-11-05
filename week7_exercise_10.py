#!/usr/bin/env python
# coding: utf-8

# In[2]:


name = "What is your name? "
place = "\nIf you could visit one place in the world, where would it be? "
responses= {}
while True:
    title = input(name)
    location = input(place)

    responses[name] = place

print("Results")
for name, place in responses.items():
    print(name.title() + " would like to visit " + place.title() + ".")

