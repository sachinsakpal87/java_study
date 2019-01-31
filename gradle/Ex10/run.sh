echo 'Calling load schema without load.data property'
gradle -q loadSchema
echo 'Calling load schema with load.data = true  property'
gradle -q -Dload.data=true loadSchema
