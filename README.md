# Hello Git

##### Description:
This project is used for learning Git!

##### Self Introduction
> Hi, I'm TensionHuang.
> It is my first time to learn git and github.
> It's so cool

##### Git learning

1. git reset
	+ what is the difference between _--hard_ and _--soft_?
	+ example: redo commit
	```
	$ git commit ...
	$ git reset --soft HEAD^      (1)
	$ edit                        (2)
	$ git commit -a -c ORIG_HEAD  (3)
	```
	+ example: undo merge or undo pull
	```
	// undo merge
	$ git pull . {remote_branch}
	$ git reset --hard ORIG_HEAD
	```

	
