#Bhaskar Chandra Trivedi
#Github Open Code
# Created to understand flow to send and receive JSON Object , Use it to understand Concept, don't copy and paste it.

from flask import Flask, request,jsonify
app = Flask(__name__)

@app.route('/')
def WelcomeToDataMining():
   return 'Welcome To Data Mining'


@app.route('/search/',methods=['POST'])
def searchText():
    req_data = request.get_json()
    print(req_data)
    if 'searchString' in req_data:
        searchdata = req_data['searchString']
        print(searchdata)
    data = {"Movie": ["NBHGGHFGHD","SDDFF"],
            "description": ["dddddddddddddddddddddasc gfhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh ttttttttttttttttttt nnnnnnnn","dsfs cvbfg"]}
    res = jsonify(data)
    print(jsonify(data))
    return jsonify(data)


if __name__ == '__main__':
   app.run()
