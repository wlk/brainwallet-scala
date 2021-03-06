Brainwallet generator written in scala using bitcoinj library  

It will output private key in `dumpwallet` format so you can import into bitcoin-qt or any other bitcoin tool that supports this format

##Running:
###password from command line
```
$ sbt "run-main com.wlangiewicz.brainwallet.Main abc both"
[info] Loading project definition from /home/w/brainwallet-generator/project
[info] Set current project to brainwallet-generator (in build file:/home/w/brainwallet-generator/)
[info] Running com.wlangiewicz.brainwallet.Main abc
1NEwmNSC7w9nZeASngHCd43Bc5eC2FmXpn,5KEQgeL4EwjuEAyPQBoaJYVrbt5kSUsrwXPkjzAQTPiNoUxxeS8
[success] Total time: 1 s, completed Oct 7, 2014 10:04:07 PM
```

We are interested in this line: `1NEwmNSC7w9nZeASngHCd43Bc5eC2FmXpn,5KEQgeL4EwjuEAyPQBoaJYVrbt5kSUsrwXPkjzAQTPiNoUxxeS8`  
Part before comma is the public address  
Part after comma is the private address in WIF format

###file with passwords
File should contain one password per line, this is example usage:
```
java -jar target/scala-2.11/brainwallet.jar file ~/mypasswords.txt private >> ~/private-keys
```


##Generating runnable jar:  
just run:  
```
sbt assembly
```

This will create brainwallet.jar in target/scala-2.11/ directory, you can run it like this:  
```
$ java -jar target/scala-2.11/brainwallet.jar abc both
1NEwmNSC7w9nZeASngHCd43Bc5eC2FmXpn,5KEQgeL4EwjuEAyPQBoaJYVrbt5kSUsrwXPkjzAQTPiNoUxxeS8
```
