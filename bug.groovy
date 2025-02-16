```groovy
def myMethod(Map params) {
  // Accessing a non-existent key throws MissingPropertyException
  def value = params.missingKey
  println value
}

myMethod(params: [key1: 'value1'])
```