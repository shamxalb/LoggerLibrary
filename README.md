# Logger Library

Logger is a library for Android Apps. It helps with ton of work such as debugging your app before releases. 

## Usage

``` 
import logger.bayramoff.com.Logger;

  @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //To define default log tag
        Logger.init("MY_LOG");
        
        //Default value is true. If false library ignore log method 
        Logger.debug(true);
        
        //Log the message
        Logger.log("app starts");
    }
```

## Installation

To get a Git project into your build:

#### Step 1. Add the JitPack repository to your build file
 
Add it in your root build.gradle at the end of repositories:
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
```
#### Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.shamxalb:LoggerLibrary:0.1.0'
	}
    
## Contributing
Feel free to use.

## License
[MIT](https://choosealicense.com/licenses/mit/)