'use strict';

app.controller('HomeController', function(HomeFactory,$scope){

	var vm = this;
    var vm2 = this;
	vm.users = [];
	vm2.poem = [];
    $scope.CurrentDate = new Date();
    $scope.CurrentDate.setHours(0, 0, 0, 0); //Seteo las horas para que el fomato quede igual
   
    
	HomeFactory.getUsers().then(function(data){
		console.log(data.data);
		vm.users = data.data;
	})

	HomeFactory.getPoems().then(function(data){
		console.log(data.data);
		vm.poems = data.data;
	})

});