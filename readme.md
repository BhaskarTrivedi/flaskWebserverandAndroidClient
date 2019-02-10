I have created my environment on windows 10, I hope step will almost remain same for mac and Linux machine.
Install anaconda if you don’t have any
Open anaconda command prompt in admin mode
Create virtual env 
conda create -n Datamining python 3.6
Activate your anaconda virtual env
Activate Datamining
Install flask
pip install flask
install android studio 
If you haven’t created any project in android, please follow hello world for [android] 
(https://google-developer-training.gitbooks.io/android-developer-fundamentals-course-practicals/content/en/Unit%201/11_p_hello_world.html) 
Server Code using flask and saved it as server.py 
execute python DataMiningServer.py
it will start your basic server, for me generated URL was http://127.0.0.1:5000/ 
create some basic android project you can fork my project also.
If you are using my project use user name as Bhaskar and password as imbhaskar at login screen.
Click on login button, it will send and received JSON object to and from flask web server
ReadReceivedJson : parse received JSON Object from server
CreateDatatoSend : Create JSON data to send to server
getResponseFromServer :  Will create URL connection and request POST message from server
AsyncTask : will start Asynchronous connection request with server
doInBackground : Will run the thread in background
onPostExecute :  Execute after it receive response from server
