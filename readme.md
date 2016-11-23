## Glossary

### Subscriber

    Its implements both interfaces Observer<T> and Subscription

### Observer

    Its the wrapper used by handling the actions when event is raised, wrapper the following method : onNext(T),onError(Throwable),onCompleted()    

### Subscription

    Allow clients to cancel a subscription by using the `unsubscribe` method.
    
    

### Observable

    Represent a flowing sequenve of values
    We `subscribe` to this Object
    Lazy initialization only emit when at least ONE subscriber exists.
    
#### Types Obervables

* Obersable.create(Subscriber)
* Obervable.just(values)
* Observable.from(values)
* Observable.range(from,n)
* Observable.empty()
* Observable.never()
* Observable.error()


#### Three types of events

1. Values of Type `T`
2. Completion event
3. Error event


## Resources
   
    -Reactive programming with RxJava
    -Reactive programming java8 rxjava
[Rx Guidelines](https://github.com/Reactive-Extensions/Rx.NET/blob/master/Rx.NET/Documentation/Rx%20Design%20Guidelines.pdf)
