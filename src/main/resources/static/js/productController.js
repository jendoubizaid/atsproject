/**
 * Created by zaid jendoubi on 08/11/2017.
 */
app.controller('productController',function($scope,$http){
    $scope.pageSize=10;
    $scope.currentPage=0;
    $scope.totalPages=0;
    $scope.products=[];
    $scope.getByCategory=function(category,page){
        $scope.currentPage=(!page)?0:page;
        $http.get('/productsByCategory?category='+category+'&page='+$scope.currentPage+'&size='+$scope.pageSize).success(function(data){
            $scope.products=data.content;
            $scope.currentPage=data.number;
            $scope.pages = new Array(data.totalPages);
        }).error(function(err){
            return err;
        });
    }
    $scope.randomize=function(){
        $http.get('/productsSortedByRandom?page='+0+'&size='+$scope.pageSize).success(function(data){
            $scope.products = data.content;
            $scope.currentPage=data.number;
            $scope.pages = new Array(data.totalPages);
        }).error(function(err){
            return err;
        });
    }
    $scope.categories=$http.get('/categories').success(function(data){
        $scope.categories=data;
    }).error(function(err){
        return err;
    });
    $scope.goToPage=function(pageNbr) {
        if (!$scope.selectedName) {
            $http.get('/products?page=' + pageNbr + '&size=' + $scope.pageSize).success(function (data) {
                $scope.products = data.content;
                $scope.currentPage = data.number;
                $scope.pages = new Array(data.totalPages);
            }).error(function (err) {
                return err;
            });
        }else{
            $scope.getByCategory($scope.selectedName,pageNbr);
        }
    };
    $scope.goToPage(0);
});
