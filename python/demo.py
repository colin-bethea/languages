'''
--- Demo (Python) ---
'''

# Import libraries
import requests

# Define main function


def demo(method="", url="", data=None):
    response = requests.request(method, url, data=data)
    print(response.content)


# Example calls
demo('GET', "https://jsonplaceholder.typicode.com/posts")
