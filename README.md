#Spring Retry Demo 保证好用

#效果图如下
10:25:57.322 [main] DEBUG org.springframework.retry.support.RetryTemplate - Retry: count=0
do something...
10:25:57.362 [main] DEBUG org.springframework.retry.backoff.ExponentialBackOffPolicy - Sleeping for 5000
10:26:02.362 [main] DEBUG org.springframework.retry.support.RetryTemplate - Checking for rethrow: count=1
10:26:02.362 [main] DEBUG org.springframework.retry.support.RetryTemplate - Retry: count=1
do something...
10:26:02.362 [main] DEBUG org.springframework.retry.backoff.ExponentialBackOffPolicy - Sleeping for 5000
10:26:07.363 [main] DEBUG org.springframework.retry.support.RetryTemplate - Checking for rethrow: count=2
10:26:07.363 [main] DEBUG org.springframework.retry.support.RetryTemplate - Retry: count=2
do something...
10:26:07.363 [main] DEBUG org.springframework.retry.support.RetryTemplate - Checking for rethrow: count=3
10:26:07.363 [main] DEBUG org.springframework.retry.support.RetryTemplate - Retry failed last attempt: count=3
发生异常了：RPC调用异常


![image](https://github.com/yangyangxf100/spring-retry-demo/blob/master/cropCircle2.png)
