# com.appium.mobile-social-media-test

# Operator
- MOBILY
- STC
- ZAIN_KSA

# App Name
- INSTAGRAM
- TWITTER
- SNAPCHAT

# Profiles
- STCInstagram
- MobilyInstagram
- ZainInstagram

<--------------------------------------->

# VM Options
-Dfirst.device.uid=DEVICE_UID
-Dsecond.device.uid=DEVICE_UID (optional)
-Doperator=OPERATOR_NAME
-Dtest.result.path=REPORT_PATH
-Dmultiple.device.test=true/false


# Appium Server
appium --address 127.0.0.1 --port 4723 --session-override --command-timeout 6000000
appium --address 127.0.0.1 --port 5556 --session-override --command-timeout 6000000
appium --address 127.0.0.1 --port 5557 --session-override --command-timeout 6000000
appium --address 127.0.0.1 --port 5558 --session-override --command-timeout 6000000
appium --address 127.0.0.1 --port 5559 --session-override --command-timeout 6000000
appium --address 127.0.0.1 --port 5560 --session-override --command-timeout 6000000

#GIT
- git checkout master (son kodun bulunduğu branch e geçer)
- git pull origin master (git deki güncel kodu local a çeker)
- git checkout YOUR_BRANCH (ilgili branch e geçer)

# KOD YAZILDIKTAN SONRA
- git commit -am "YOUR_COMMIT_MESSAGE"
- git push origin 