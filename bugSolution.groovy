```groovy
def myMethod(Map params) {
  // Safe access using the get() method
  def value = params.get('missingKey')
  println value ?: 'Key not found'

  //Alternative using elvis operator
  def value2 = params['missingKey'] ?: 'Key not found'
  println value2
}

myMethod(params: [key1: 'value1']) 
```