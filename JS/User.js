class User extends Account {

    constructor(account, email, pswd){
        super(account, email, pswd);
        this.account = account;
        this.email = email;
        this.password = pswd;

    }

    printAllUserData(){
        console.log("---User Data---\r\n");

        this.account.printAllAccountData();
        console.log("email:\t", this.email);
        console.log("pswd:\t", this.password);
        
    }
}