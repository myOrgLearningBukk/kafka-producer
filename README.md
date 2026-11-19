Step1 :
--------------------------------------------
Create cluster ps:  D:\kafka\kafka_2.13-4.4.0> .\bin\windows\kafka-storage.bat random-uuid

V6wqau0mQ8CMXPpXjd2Qiw
---------------------------------------
Step2 :
PS D:\kafka\kafka_2.13-4.4.0> .\bin\windows\kafka-storage.bat format --standalone -t V6wqau0mQ8CMXPpXjd2Qiw -c .\config\server.properties

Step 3:
--------------------------------------
PS D:\kafka\kafka_2.13-4.4.0> .\bin\windows\kafka-server-start.bat .\config\server.properties


step 4 : 
------------------------------------------------
create topic : PS D:\kafka\kafka_2.13-4.4.0\bin> .\windows\kafka-topics.bat --create --topic quickstart-events --bootstrap-server localhost:9092


step 5 : 
------------------------------------------
PS D:\kafka\kafka_2.13-4.4.0\bin> .\windows\kafka-topics.bat --describe --topic quickstart-events --bootstrap-server localhost:9092
2026-11-10T15:00:43.491166800Z main ERROR Reconfiguration failed: No configuration found for '3cd1a2f1' at 'null' in 'null'
Topic: quickstart-events        TopicId: ofO1MFbtRsGItYP5IaKEvg PartitionCount: 1       ReplicationFactor: 1    Configs: min.insync.replicas=1,segment.bytes=1073741824
        Topic: quickstart-events        Partition: 0    Leader: 1       Replicas: 1     Isr: 1  Elr:    LastKnownElr:


step 6 : 
----------------------------------------------
PS D:\kafka\kafka_2.13-4.4.0\bin> .\windows\kafka-console-producer.bat --topic quickstart-events --bootstrap-server localhost:9092
2026-11-10T15:02:06.795567100Z main ERROR Reconfiguration failed: No configuration found for '3cd1a2f1' at 'null' in 'null'
>Hi How r u
>HI FIne
>thank you
>no wories
>Terminate batch job (Y/N)? y

key value pair:

PS D:\kafka\kafka_2.13-4.4.0\bin> .\windows\kafka-console-producer.bat --topic quickstart-events --bootstrap-server localhost:9092 --property "parse.key=true" --property "key.separator=:"
>> firstName:abc
>> firstName:fdg

step 7 : 
------------------------------------------

PS D:\kafka\kafka_2.13-4.4.0\bin> .\windows\kafka-console-consumer.bat --topic quickstart-events --from-beginning --bootstrap-server localhost:9092


PS D:\kafka\kafka_2.13-4.4.0\bin> .\windows\kafka-console-consumer.bat --topic quickstart-events --from-beginning --bootstrap-server localhost:9092 --topic quickstart-events --property "parse.key=true" --property "key.separa=:"



