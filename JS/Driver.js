class Driver extends Account {
    constructor(account, email, pswd){
        super(account);
        this.account = account;
        this.email = email;
        this.password = pswd;
    }

    printAllDriverData(){
        console.log("---Driver Data---\r\n");
        this.account.printAllAccountData();
        console.log("email:\t", this.email);
        console.log("pswd:\t", this.password);
    }
}