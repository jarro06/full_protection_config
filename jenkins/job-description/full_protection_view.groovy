 
listView('full_protection Jobs') {
    description('full_protection Jobs')
    jobs {
        regex('full_protection_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
