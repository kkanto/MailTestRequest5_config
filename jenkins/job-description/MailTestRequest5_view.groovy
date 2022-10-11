 
listView('MailTestRequest5 Jobs') {
    description('MailTestRequest5 Jobs')
    jobs {
        regex('MailTestRequest5_.+')
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
