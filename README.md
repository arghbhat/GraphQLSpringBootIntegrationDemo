# GraphQLSpringBootIntegrationDemo

Policy Database
=================

ID-Auto Generated
Product Desc
Account Owner
Tax ID-Auto
Issue Date




mutation {
  createAccountDetail(productDesc: "Jeevan Saral", accountOwner: "Arghya", taxID: "123456789", issueDate: "2019-12-17") 
  {
    id
  }
}

mutation {
  createAccountDetail(productDesc: "Jeevan Sathi", accountOwner: "Bhatt", taxID: "123456798", issueDate: "2019-12-16") 
  {
    id
  }
}

query{
  accountDetail(id:1){
    id,
    productDesc,
    accountOwner,
    taxID,
    issueDate
  }
}

query{
  accountDetails(count:1){
    id,
    productDesc,
    accountOwner,
    taxID,
    issueDate
  }
}
