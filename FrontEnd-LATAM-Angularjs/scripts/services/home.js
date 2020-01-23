'use strict';

app.factory('HomeFactory', function($http){
app.constant("moment", moment);
	var url = 'http://localhost:8080/api/v1/birthDay';
	var path = 'http://localhost:8080/api/v1/birthDay';

	var HomeFactory = {

		getUsers: function(){
			return $http.get(url).success(function(data){
				return data;
			})
			.error(function(err){
				console.log(err);
			})
		},
		getPoems: function(){
			return $http.get('https://www.poemist.com/api/v1/randompoems').success(function(data){
				return data;
			})
			.error(function(err){
				console.log(err);
			})
		},

		createUser: function(user){

			return $http.post(path, user).success(function(data){
				return data;
			})
			.error(function(err){
				console.log(err)
			})


		}

	};

	return HomeFactory

});