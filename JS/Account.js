class Account {

    constructor(name, document) {
     this.id;
     this.name = name;
     this.document = document;
     this.email;
     this.password;
    }

    SetID(id) {
        this.id = id;
    }
    
    printAllAccountData() {
        console.log(" ID: ", this.id);
        console.log(" Name: ", this.name);
        console.log(" Document: ", this.document);
    }

    printPublicAccountData() {
        console.log(this.name);
        console.log(this.document);
        console.log(this.email);

    }

    printPrivateAccountData() {
        console.log(this.id);
        console.log(this.password);

    }
}