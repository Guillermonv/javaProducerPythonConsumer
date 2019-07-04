import json
from kafka import KafkaConsumer
import json

if __name__ == '__main__':
    parsed_topic_name = 'guilletopic'
    # Notify if a recipe has more than 200 calories
    calories_threshold = 200

    consumer = KafkaConsumer(parsed_topic_name, auto_offset_reset='earliest',
                             bootstrap_servers=['localhost:9092'], consumer_timeout_ms=1000)
    for msg in consumer:
        print(msg.value)