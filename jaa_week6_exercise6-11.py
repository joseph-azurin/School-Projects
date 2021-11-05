#!/usr/bin/env python
# coding: utf-8

# In[17]:


cities = {
    'Manila': {
        'country': 'Philippines',
        'population': 178000000,
        'currency': 'Peso',
        },
    'Vermont': {
        'country': 'USA',
        'population': 626000,
        'currency': ' U.S. Dollar',
        },
    'Tokyo': {
        'country': 'Japan',
        'population': 920000000,
        'currency': 'Yen',
        }
    }

for city, city_info in cities.items():
    country = city_info['country'].title()
    population = city_info['population']
    currency = city_info['currency'].title()

    print("\n" + city.title() + " is in " + country + ".")
    print("  The population is " + str(population) + ".")
    print("  The " + currency + " is the main currency.")


# In[ ]:




